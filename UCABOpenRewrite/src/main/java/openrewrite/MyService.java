package openrewrite;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void processRequest(String requestData) {
        // Código complejo y difícil de entender
        if (requestData.startsWith("A") && requestData.endsWith("B")) {
            // Procesamiento específico para solicitudes que comienzan con "A" y terminan con "B"
        } else if (requestData.contains("C") && requestData.length() > 10) {
            // Procesamiento específico para solicitudes que contienen "C" y tienen más de 10 caracteres
        } else {
            // Procesamiento genérico para solicitudes que no cumplen con las condiciones anteriores
        }
    }
}

