//package com.example.demo.controller;
//
//import com.example.demo.model.Card;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestClientResponseException;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Log4j2
//@RestController
//@RequestMapping("/test")
//public class TestController {
//
//    @Autowired
//    RestTemplate restTemplate;
//
//    @GetMapping("/1")
//    public ResponseEntity getCards() {
//        List<Card> cards = restTemplate.getForObject("http://localhost:8080/api/cards", List.class);
//        return ResponseEntity.ok(cards);
//    }
//
//    @GetMapping("/2")
//    public ResponseEntity addCards() {
//        Card card = new Card();
//        card.setNumber("1236545");
//        card.setHolder("AramPoghosyan");
//        card.setCvv("99999");
//        card.setBalance(1000000);
//        try {
//            HttpHeaders httpHeaders = new HttpHeaders();
//            httpHeaders.add("OriginModule", "demo2");
//            HttpEntity<Card> httpEntity = new HttpEntity<>(card, httpHeaders);
//            ResponseEntity<Card> cardResponseEntity = restTemplate.exchange("http://localhost:8080/api/cards", HttpMethod.POST, httpEntity, Card.class);
//
//            Card saved = cardResponseEntity.getBody();
//            log.info(card.getNumber());
//            return cardResponseEntity;
//        } catch (RestClientResponseException exception) {
//            log.error(exception.getMessage());
//            return ResponseEntity.
//                    status(exception.getRawStatusCode()).
//                    contentType(MediaType.APPLICATION_JSON).
//                    body(exception.getResponseBodyAsString());
//        }
//    }
//}
