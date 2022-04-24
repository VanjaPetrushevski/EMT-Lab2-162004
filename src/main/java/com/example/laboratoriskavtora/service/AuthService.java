package com.example.laboratoriskavtora.service;

import com.example.laboratoriskavtora.model.User;

public interface AuthService {
    User getCurrentUser();
    String getCurrentUserId();
}
