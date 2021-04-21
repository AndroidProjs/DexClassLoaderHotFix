package com.edger.hotfix;

public class SayException implements ISay {
    @Override
    public String saySomething() {
        return "Something wrong here.";
    }
}
