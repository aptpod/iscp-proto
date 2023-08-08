# iscp-proto

iSCPv2のProtocolBuffer

## Prerequisite

- [buf](https://github.com/bufbuild/buf)
- [npm](https://www.npmjs.com/) ※ Typescriptの生成のみ

   ```bash
   npm install @bufbuild/protobuf @bufbuild/protoc-gen-es @bufbuild/buf
   ```

- [go](https://go.dev/) ※ gogoprotoの生成のみ

   ```bash
    go install github.com/gogo/protobuf/protoc-gen-gogofast@v1.3.2
    go run github.com/x-motemen/ghq@latest get github.com/gogo/protobuf/gogoproto
   ```

## Usage

1. `buf.gen.yaml` を編集して生成したいコードのみと対象とします。
2. コードを生成します。

```bash
# ソースコードの生成
buf generate proto
# gogoproton用のソースコードの生成
buf generate proto --template ./buf.gen.gogoproto.yaml
```

`gen` ディレクトリに生成したコードは配置済みです。

## License
