theme: /

    state:
        q!: *
        a: Вы сказали: {{$parseTree.text}}
    state:
        q!: оператор
        a: switch bitch
        script:
            $response.replies.push({
                type: "switch",
                closeChatPhrases: ["/close", "вернуться в беседу с роботом"],
                firstMessage: "First message",
            });
