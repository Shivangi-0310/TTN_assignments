package com.demo;

import java.io.IOException;

public class Chair {
    Float number;

    public Chair() {
    }

    public Chair(Float number) {
        this.number = number;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public String statement()
    {      String str="This is a chair class";
        return str ;
    }
    String ioException() throws IOException {
        throw new IOException();
    }

}
