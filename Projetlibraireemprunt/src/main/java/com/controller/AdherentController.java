package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.service.*;
@RestController
public class AdherentController {
@Autowired 
private AdherentService adherentservice;
}
