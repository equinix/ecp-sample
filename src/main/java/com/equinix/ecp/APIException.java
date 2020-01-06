package com.equinix.ecp;

public class APIException extends Exception{

        private int code = 0;
        private String message = null;

        public APIException() { }

        public APIException(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }



