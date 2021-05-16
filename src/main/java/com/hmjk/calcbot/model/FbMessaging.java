package com.hmjk.calcbot.model;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Map;

public class FbMessaging implements Serializable {
    private Map<String,String> sender;
    private Map<String,String> recipient;
    private Long timestamp;
    private FbMessage message;
    private FbPostBack postback;

    public FbMessaging() {
    }

    public FbMessaging(Map<String, String> sender, Map<String, String> recipient, Long timestamp, FbMessage message) {
        this.sender = sender;
        this.recipient = recipient;
        this.timestamp = timestamp;
        this.message = message;
    }

    public Map<String, String> getSender() {
        return sender;
    }

    public Map<String, String> getRecipient() {
        return recipient;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public FbMessage getMessage() {
        return message;
    }

    public FbPostBack getPostback() {
        return postback;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
/*
{
  "sender":{
    "id":"<PSID>"
  },
  "recipient":{
    "id":"<PAGE_ID>"
  },
  "timestamp":1458692752478,
  "message":{
    "mid":"mid.1457764197618:41d102a3e1ae206a38",
    "text":"hello, world!",
    "quick_reply": {
      "payload": "<DEVELOPER_DEFINED_PAYLOAD>"
    }
  }
}
 */