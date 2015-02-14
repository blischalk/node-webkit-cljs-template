# {{name}}

Add your info about your application here.

Start a repl using Weasel with:

    user> (require 'weasel.repl.websocket)
    nil
    user> (cemerick.piggieback/cljs-repl
        :repl-env (weasel.repl.websocket/repl-env
        :ip "0.0.0.0" :port 9001))

    << started Weasel server on ws://0.0.0.0:9001 >>
    Type `:cljs/quit` to stop the ClojureScript REPL
    nil

More info: https://github.com/tomjakubowski/weasel
