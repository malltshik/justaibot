theme: /

    state: Echo
        event!: noMatch
        a: Вы сказали: {{$parseTree.text}}
    
    state: Operator
        q!: оператор
        a: switch bitch
        script:
            $response.replies.push({
                type:"switch",
                ignoreOffline: true,
                closeChatPhrases: ["/close", "вернуться в беседу с роботом"],
                firstMessage: "First message",
            });
            
    state:
        event: livechatFinished
        a: Этот пидор вышел
