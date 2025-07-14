package com.mycompany.proyecto_final.modelo;

public class Token{
    private String token;
    
    public Token(String token){
        this.token = token;
    }    
    
    public String getToken(){
        return token;
    }
    
    public boolean isValid(String token) {
        //consulta a api, service de token
        return token != null && token.startsWith("ABC");
    }
}
