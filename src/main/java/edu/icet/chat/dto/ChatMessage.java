package edu.icet.chat.dto;

import edu.icet.chat.util.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
