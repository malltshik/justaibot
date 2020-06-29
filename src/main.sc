theme: /

    state: Echo
        event!: noMatch
        a: Вы сказали: {{$parseTree.text}}
    
    state: Operator
        q!: оператор
        a: switch
        script:
            $response.replies.push({
                type:"switch",
                ignoreOffline: true,
                closeChatPhrases: ["/close", "вернуться в беседу с роботом"],
                firstMessage: "First message",
            });
            
    state:
        event: livechatFinished
        a: He's left
