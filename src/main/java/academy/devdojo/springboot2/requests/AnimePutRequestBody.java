package academy.devdojo.springboot2.requests;

import lombok.Data;

//Classe dto
@Data
public class AnimePutRequestBody {
    private Long id;
    private String name;
}
