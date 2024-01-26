/*
 * This file is part of ViaVersion - https://github.com/ViaVersion/ViaVersion
 * Copyright (C) 2016-2024 ViaVersion and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.viaversion.viaversion.protocols.protocol1_20_5to1_20_3.packet;

public enum ServerboundPackets1_20_5 implements ServerboundPacket1_20_5 {

    TELEPORT_CONFIRM, // 0x00
    QUERY_BLOCK_NBT, // 0x01
    SET_DIFFICULTY, // 0x02
    CHAT_ACK, // 0x03
    CHAT_COMMAND, // 0x04
    CHAT_MESSAGE, // 0x05
    CHAT_SESSION_UPDATE, // 0x06
    CHUNK_BATCH_RECEIVED, // 0x07
    CLIENT_STATUS, // 0x08
    CLIENT_SETTINGS, // 0x09
    TAB_COMPLETE, // 0x0A
    CONFIGURATION_ACKNOWLEDGED, // 0x0B
    CLICK_WINDOW_BUTTON, // 0x0C
    CLICK_WINDOW, // 0x0D
    CLOSE_WINDOW, // 0x0E
    CONTAINER_SLOT_STATE_CHANGED, // 0x0F
    COOKIE_RESPONSE, // 0x10
    PLUGIN_MESSAGE, // 0x11
    EDIT_BOOK, // 0x12
    ENTITY_NBT_REQUEST, // 0x13
    INTERACT_ENTITY, // 0x14
    GENERATE_JIGSAW, // 0x15
    KEEP_ALIVE, // 0x16
    LOCK_DIFFICULTY, // 0x17
    PLAYER_POSITION, // 0x18
    PLAYER_POSITION_AND_ROTATION, // 0x19
    PLAYER_ROTATION, // 0x1A
    PLAYER_MOVEMENT, // 0x1B
    VEHICLE_MOVE, // 0x1C
    STEER_BOAT, // 0x1D
    PICK_ITEM, // 0x1E
    PING_REQUEST, // 0x1F
    CRAFT_RECIPE_REQUEST, // 0x20
    PLAYER_ABILITIES, // 0x21
    PLAYER_DIGGING, // 0x22
    ENTITY_ACTION, // 0x23
    STEER_VEHICLE, // 0x24
    PONG, // 0x25
    RECIPE_BOOK_DATA, // 0x26
    SEEN_RECIPE, // 0x27
    RENAME_ITEM, // 0x28
    RESOURCE_PACK_STATUS, // 0x29
    ADVANCEMENT_TAB, // 0x2A
    SELECT_TRADE, // 0x2B
    SET_BEACON_EFFECT, // 0x2C
    HELD_ITEM_CHANGE, // 0x2D
    UPDATE_COMMAND_BLOCK, // 0x2E
    UPDATE_COMMAND_BLOCK_MINECART, // 0x2F
    CREATIVE_INVENTORY_ACTION, // 0x30
    UPDATE_JIGSAW_BLOCK, // 0x31
    UPDATE_STRUCTURE_BLOCK, // 0x32
    UPDATE_SIGN, // 0x33
    ANIMATION, // 0x34
    SPECTATE, // 0x35
    PLAYER_BLOCK_PLACEMENT, // 0x36
    USE_ITEM; // 0x37

    @Override
    public int getId() {
        return ordinal();
    }

    @Override
    public String getName() {
        return name();
    }
}
