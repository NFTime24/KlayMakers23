package com.nftime.klaymakers.service.user;

import com.nftime.klaymakers.entity.time.UserEntity;
import com.nftime.klaymakers.repository.time.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dukedev1004@crossangle.io on 11/26/23
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public List<UserEntity> getUserList(){
        return userRepository.findAll();
    }
}
