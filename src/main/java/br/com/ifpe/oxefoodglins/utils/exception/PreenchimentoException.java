package br.com.ifpe.oxefoodglins.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class PreenchimentoException extends RuntimeException{
	
    private static final long serialVersionUID = -5070676194084709382L;
	
	public static final String MSG_PREENCHIMENTO_OBRIGATORIO = "É necessário informar algum valor para o campo %s.";
    public static final String MSG_CHAVE_NAO_INFORMADA = "Informe a chave da empresa.";

    public PreenchimentoException(String msg) {

    super(String.format(msg));
    }

    public PreenchimentoException(String msg, String param) {

    super(String.format(msg, param));
    }

}
