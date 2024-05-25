package openrewrite;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void processRequest(String requestData) {
        // Código complejo con múltiples variables locales
        String trimmedData = requestData.trim();
        int dataLength = trimmedData.length();
        boolean startsWithA = trimmedData.startsWith("A");
        boolean endsWithB = trimmedData.endsWith("B");
        boolean containsC = trimmedData.contains("C");

        // Lógica de negocio que utiliza las variables locales
        if (startsWithA && endsWithB) {
            // Procesamiento específico para solicitudes que comienzan 
        	//con "A" y terminan con "B"
        } else if (containsC && dataLength > 10) {
            // Procesamiento específico para solicitudes que contienen 
        	//"C" y tienen más de 10 caracteres
        } else {
            // Procesamiento genérico para solicitudes que no cumplen 
        	//con las condiciones anteriores
        }
    }
}
