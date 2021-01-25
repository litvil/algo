package com.litvil.algo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.time.ZonedDateTime;

@RestController
class HealthcheckController {

  @GetMapping(
      value = "/healthcheck",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity healthcheck(@RequestParam(defaultValue = "") String format) {

    if (format.equals("short")) {
      final HealthCheckShort response = new HealthCheckShort();
      response.setStatus("OK");

      return ResponseEntity.ok(response);
    }
    if (format.equals("full")) {
      final HealthCheckFull response = new HealthCheckFull();

      response.setCurrentTime(ZonedDateTime.now());
      response.setApplication("OK");

      return ResponseEntity.ok(response);
    }

    throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
  }

  class HealthCheckFull {

    private ZonedDateTime currentTime;
    private String application;

    public void setCurrentTime(ZonedDateTime currentTime) {
      this.currentTime = currentTime;
    }

    public void setApplication(String application) {
      this.application = application;
    }

    public ZonedDateTime getCurrentTime() {
      return currentTime;
    }

    public String getApplication() {
      return application;
    }
  }
  class HealthCheckShort {
    private String status;

    public void setStatus(String status) {
      this.status = status;
    }

    public String getStatus() {
      return status;
    }
  }
}
