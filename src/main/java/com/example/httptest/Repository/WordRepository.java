package com.example.httptest.Repository;

import com.example.httptest.Entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, String>
{
    //Word findBySpelling(String spelling);
}
