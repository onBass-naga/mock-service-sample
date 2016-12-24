# mock-service-sample

Grails で環境指定により使用するコンポーネントを切り替えるサンプルです。  
もっと良い方法があるかも。。。

## 起動時の環境指定

デフォルトでは `development` が使用されます。  
その他の指定を行う場合は起動時の引数で指定します。

```
$ grails -Dgrails.env=prod run-app
```

## コンポーネント切り替え

`grails-app/conf/spring/resources.groovy` ファイルでDIします。


