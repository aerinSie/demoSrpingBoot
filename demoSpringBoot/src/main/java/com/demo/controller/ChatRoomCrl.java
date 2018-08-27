package com.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.demo.model.GetClientMessegeVo;
import com.demo.model.SendClientMessegeVo;

@Controller
public class ChatRoomCrl {

	@MessageMapping("/messageControl")
	@SendTo("topic/getResponse")
	public SendClientMessegeVo said(GetClientMessegeVo responseMessage) throws InterruptedException {
		Thread.sleep(3000);
		return new SendClientMessegeVo();
	}
}
