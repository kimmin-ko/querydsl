package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class MemberDto {
    private String username;
    private int age;

    @QueryProjection // DTO가 Q 타입으로 생성됨
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

}
