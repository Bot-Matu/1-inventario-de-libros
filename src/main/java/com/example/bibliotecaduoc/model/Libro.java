package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoargsConstructor;

@data
@AllArgsConstructor
@NoArgsConstructor

public class Libro{
    private int id;
    private String isbn;
    private String titulo;
    private String Editoria;
    private Int fechaPublicacion;
    private String autor;
}