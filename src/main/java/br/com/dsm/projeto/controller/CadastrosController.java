package br.com.dsm.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import br.com.dsm.projeto.model.Cadastro;

@Controller
@RequestMapping("/usuarios")
public class CadastrosController {

  private List<Cadastro> cadastros = new ArrayList<>();

  @GetMapping
  public ModelAndView listar() {

  }
  
  @PostMapping
  public ModelAndView cadastrar() {

  }
}

