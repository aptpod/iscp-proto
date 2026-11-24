# iscp-proto

iSCPv2のProtocolBuffer

## Prerequisite

- [buf](https://github.com/bufbuild/buf)
- [npm](https://www.npmjs.com/) ※ Typescriptの生成のみ

   ```bash
   npm install @bufbuild/protobuf @bufbuild/protoc-gen-es @bufbuild/buf
   ```

## Usage

1. gitサブモジュールとして利用します

    ```bash
    git submodule add https://github.com/aptpod/iscp-proto.git iscp-proto
    # or
    git submodule add git@github.com:aptpod/iscp-proto.git iscp-proto
    ```

2. プロジェクトのルートに`buf.gen.yaml` を作成します。`iscp-proto/buf.gen.yaml` を参考に編集します。
3. コードを生成します。

```bash
# ソースコードの生成
buf generate iscp-proto/proto
```

`gen` ディレクトリに生成したコードは配置済みです。

`gen/gogofast` は非推奨です。生成はやめており、proto を変更しても更新されません。Go からは `gen/go`（google.golang.org/protobuf と vtprotobuf）を使ってください。`gen/gogofast` は別の Go module（`github.com/aptpod/iscp-proto/gen/gogofast`）で、使う場合は iscp-proto と別に require します。

## License
