module github.com/aptpod/iscp-proto

go 1.20

replace github.com/aptpod/iscp-proto => ./

require (
	github.com/planetscale/vtprotobuf v0.6.0
	google.golang.org/protobuf v1.31.0
)

require golang.org/x/xerrors v0.0.0-20200804184101-5ec99f83aff1 // indirect
