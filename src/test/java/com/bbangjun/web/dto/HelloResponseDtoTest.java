package com.bbangjun.web.dto;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest { // 74p
    public void 롬복_기능_테스트(){

        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount); // assertThat에 있는 값과 isEualTo의 값이 같을 때 성공
    }
}
