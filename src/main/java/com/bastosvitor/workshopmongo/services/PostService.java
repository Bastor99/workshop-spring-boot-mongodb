package com.bastosvitor.workshopmongo.services;

import com.bastosvitor.workshopmongo.domain.Post;
import com.bastosvitor.workshopmongo.domain.User;
import com.bastosvitor.workshopmongo.dto.UserDTO;
import com.bastosvitor.workshopmongo.repository.PostRepository;
import com.bastosvitor.workshopmongo.repository.UserRepository;
import com.bastosvitor.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
