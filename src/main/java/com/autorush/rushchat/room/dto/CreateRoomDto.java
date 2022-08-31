package com.autorush.rushchat.room.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateRoomDto {
    private String roomName;
    private String ownerOAuthId;
    private String ownerRegisteredPlatform;
    private Long maxParticipants;
}