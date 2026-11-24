DIR_DIST := gen

VERSION_PROTOC_GO=v1.26

.PHONY: build-all
build-all: build-proto format

.PHONY: build-proto
build-proto:
	buf generate proto

.PHONY: lint
lint:
	buf lint proto

.PHONY: format
format:
	buf format --exit-code -w proto
	go run golang.org/x/tools/cmd/goimports@latest -w .

.PHONY: tools
tools:
	npm ci

.PHONY: clean
clean:
	rm -rf $(filter-out $(DIR_DIST)/gogofast,$(wildcard $(DIR_DIST)/*))
