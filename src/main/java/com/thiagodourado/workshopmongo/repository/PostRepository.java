package com.thiagodourado.workshopmongo.repository;

import com.thiagodourado.workshopmongo.domain.Post;
import com.thiagodourado.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
