package BackEnd.service;

import BackEnd.DTO.UserRegistration;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register(UserRegistration request) {
        return "Its Works Kollo";
    }
}
