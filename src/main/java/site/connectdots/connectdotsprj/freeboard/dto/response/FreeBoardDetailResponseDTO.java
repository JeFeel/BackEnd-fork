package site.connectdots.connectdotsprj.freeboard.dto.response;

import lombok.*;
import site.connectdots.connectdotsprj.freeboard.entity.FreeBoard;
import site.connectdots.connectdotsprj.member.entity.Member;

import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FreeBoardDetailResponseDTO {
    private FreeBoardResponseDTO freeBoardListResponseDTO;
    private String memberNickname;
    private String memberProfile;
    private List<FreeBoardDetailReplyDTO> replyList;

    public FreeBoardDetailResponseDTO(FreeBoard freeBoard, List<FreeBoardDetailReplyDTO> replyList) {
        this.freeBoardListResponseDTO = new FreeBoardResponseDTO(freeBoard);
        this.memberNickname = freeBoard.getMember().getMemberNickname();
        this.memberProfile = freeBoard.getMember().getMemberProfile();
        this.replyList = replyList;
    }

}
