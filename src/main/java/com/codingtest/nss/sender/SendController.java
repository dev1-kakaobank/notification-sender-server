package com.codingtest.nss.sender;

import com.codingtest.nss.sender.dto.KakaotalkSendRequest;
import com.codingtest.nss.sender.dto.SendResponse;
import com.codingtest.nss.sender.dto.SmsSendRequest;
import com.codingtest.nss.sender.dto.EmailSendRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SendController {

    private final NotificationSender sender = new NotificationSender();

    @PostMapping("/send/sms")
    public SendResponse sendSms(@RequestBody final SmsSendRequest request ) {
        log.debug("# SmsSendRequest : {}", request);
        final ResponseTypeSelector selector = new ResponseTypeSelector();
        return sender.send(selector);
    }

    @PostMapping("/send/kakaotalk")
    public SendResponse sendKakaotalk(@RequestBody final KakaotalkSendRequest request ) {
        log.debug("# KakaotalkSendRequest : {}", request);
        final ResponseTypeSelector selector = new ResponseTypeSelector();
        return sender.send(selector);
    }

    @PostMapping("/send/email")
    public SendResponse sendEmail(@RequestBody final EmailSendRequest request ) {
        log.debug("# EmailSendRequest : {}", request);
        final ResponseTypeSelector selector = new ResponseTypeSelector();
        return sender.send(selector);
    }
}
