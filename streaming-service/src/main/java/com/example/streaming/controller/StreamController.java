package com.example.streaming.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
public class StreamController {

	@GetMapping(value = "/data")
	public ResponseEntity<StreamingResponseBody> streamData() {
		StreamingResponseBody responseBody = response -> {
			for (int i = 1; i <= 1000; i++) {
				try {
					Thread.sleep(10);
					response.write(("Data stream line - " + i + "\n").getBytes());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(responseBody);
	}
}
