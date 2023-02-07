package com.example.Email.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
@Autowired
EmailService service;
@PostMapping("/send")
public String sendmail(@RequestBody EmailModel model) {
String email= service.sendmail(model.getToemail(),model.getSubject(),model.getBody());
return email;
}
}
