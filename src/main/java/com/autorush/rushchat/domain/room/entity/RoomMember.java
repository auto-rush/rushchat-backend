package com.autorush.rushchat.domain.room.entity;

import com.autorush.rushchat.member.entity.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rm_room_id")
    private Long roomId;

    @ManyToOne
    @JoinColumn(name = "registeredPlatform")
    private Member member;

//    private Long lastMessageId;

    @Builder
    public RoomMember(Long roomId, Member member) {
        this.roomId = roomId;
        this.member = member;
    }
}
