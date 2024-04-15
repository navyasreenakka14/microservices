package com.userservice.payload;

import org.springframework.http.HttpStatus;

public class ApiResponse {
    private String msg;
    private boolean success;
    private HttpStatus status;

    // Private constructor to prevent direct instantiation
    private ApiResponse() {
    }

    public String getMsg() {
        return msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public HttpStatus getStatus() {
        return status;
    }

    // Builder static inner class
    public static class Builder {
        private String msg;
        private boolean success;
        private HttpStatus status;

        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            ApiResponse response = new ApiResponse();
            response.msg = this.msg;
            response.success = this.success;
            response.status = this.status;
            return response;
        }
    }

    // Static method to obtain a Builder instance
    public static Builder builder() {
        return new Builder();
    }
}
