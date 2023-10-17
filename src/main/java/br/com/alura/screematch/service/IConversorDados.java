package br.com.alura.screematch.service;

public interface IConversorDados {

    <T> T obterDados(String json, Class<T> classe);

}
