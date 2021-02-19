package com.example.httptest.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "word")
public class Word
{
    @Id
    String spelling;
    String explanation;

    public String getSpelling()
    {
        return spelling;
    }

    public void setSpelling(String spelling)
    {
        this.spelling = spelling;
    }

    public String getExplanation()
    {
        return explanation;
    }

    public void setExplanation(String explanation)
    {
        this.explanation = explanation;
    }
}
