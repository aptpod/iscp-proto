# iscp-proto

iSCPv2のProtocolBuffer

## Installation

gitサブモジュールとして利用します

```bash
git submodule add https://github.com/aptpod/iscp-proto.git iscp-proto
# or
git submodule add git@github.com:aptpod/iscp-proto.git iscp-proto
```

## Usage

任意のprotocコンパイラで任意の場所に生成してください

### Go

[gogoproto](https://github.com/gogo/protobuf) の `gogofast` プラグインを利用します。使い方はMakefileを参照してください。

### その他の言語

`std` 内のprootoファイルを利用します。

## Contributing

各言語毎にサポートするprotoファイルがあるので必ず互換を維持するように同期をとってください。

```
make diff
```

を実行し、差分がある場合は差分の正しさを判断して適宜修正を行います。
修正後、差分が妥当だと判断できる場合は `make update-diff` を実行しdiffファイルを更新してください。

## License
