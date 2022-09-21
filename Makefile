DIR_DIST := dist
DIR_DIST_GO := $(DIR_DIST)/go/iscp2
DIR_PROTO_GOGOFAST := ./go
DIR_PROTO_STD := ./std
DIR_DIST_GOGOFAST := $(DIR_DIST)/gogofast/iscp2
IMPORT_ROOT := github.com/aptpod/iscp-proto
IMPORT_EXTENSIONS := $(IMPORT_ROOT)/extensions

VERSION_PROTOC_GOGOPROTO=v1.3.2
VERSION_PROTOC_GO=v1.26

.PHONY: build-all
build-all: build-go-std build-go-gogofast

.PHONY: build-go-std
build-go-std: $(DIR_DIST_GO)
	protoc -I=$(DIR_PROTO_STD) -I=$(GOPATH)/src -I ./$(DIR_PROTO_STD)/extensions \
		--go_opt=paths=source_relative \
		--go_opt=Mcommon.proto=$(IMPORT_ROOT) \
		--go_opt=Mconnection.proto=$(IMPORT_ROOT) \
		--go_opt=Mdownstream.proto=$(IMPORT_ROOT) \
		--go_opt=Me2e_call.proto=$(IMPORT_ROOT) \
		--go_opt=Mmessage.proto=$(IMPORT_ROOT) \
		--go_opt=Mmetadata.proto=$(IMPORT_ROOT) \
		--go_opt=Mping_pong.proto=$(IMPORT_ROOT) \
		--go_opt=Mresult_code.proto=$(IMPORT_ROOT) \
		--go_opt=Mupstream.proto=$(IMPORT_ROOT) \
		--go_opt=Mextensions/downstream.proto=$(IMPORT_EXTENSIONS) \
		--go_opt=Mextensions/connection.proto=$(IMPORT_EXTENSIONS) \
		--go_opt=Mextensions/e2e_call.proto=$(IMPORT_EXTENSIONS) \
		--go_opt=Mextensions/ping_pong.proto=$(IMPORT_EXTENSIONS) \
		--go_opt=Mextensions/upstream.proto=$(IMPORT_EXTENSIONS) \
		--go_out=:$< ./$(DIR_PROTO_STD)/*.proto ./$(DIR_PROTO_STD)/extensions/*.proto

.PHONY: build-go-gogofast
build-go-gogofast: $(DIR_DIST_GOGOFAST)
	protoc -I=$(DIR_PROTO_GOGOFAST) -I=$(GOPATH)/src --gogofast_out=:$< $(DIR_PROTO_GOGOFAST)/extensions/*.proto
	protoc -I=$(DIR_PROTO_GOGOFAST) -I=$(GOPATH)/src \
		--gogofast_out=Mextensions/downstream.proto=$(IMPORT_EXTENSIONS),Mextensions/connection.proto=$(IMPORT_EXTENSIONS),Mextensions/e2e_call.proto=$(IMPORT_EXTENSIONS),Mextensions/ping_pong.proto=$(IMPORT_EXTENSIONS),Mextensions/upstream.proto=$(IMPORT_EXTENSIONS):$< $(DIR_PROTO_GOGOFAST)/*.proto


$(DIR_DIST_GO):
	echo $@/extensions
	mkdir -p $@/extensions

$(DIR_DIST_GOGOFAST):
	mkdir -p $@/extensions

.PHONY: tools
tools:
	go install google.golang.org/protobuf/cmd/protoc-gen-go@$(VERSION_PROTOC_GO)
	go install github.com/gogo/protobuf/protoc-gen-gogofast@$(VERSION_PROTOC_GOGOPROTO)
	git config --local ghq.root ${GOPATH}/src
	go run github.com/x-motemen/ghq@latest get github.com/gogo/protobuf/gogoproto
	git config --local --unset ghq.root

.PHONY: clean
clean:
	rm -rf $(DIR_DIST)

.PHONY: diff
diff:
	diff ./std ./go > diff.txt.new || true
	diff ./std/extensions ./go/extensions >> diff.txt.new || true
	diff ./diff.txt.new ./diff.txt
	rm ./diff.txt.new

.PHONY: update-diff
update-diff:
	diff ./std ./go > diff.txt || true
	diff ./std/extensions ./go/extensions >> diff.txt || true

