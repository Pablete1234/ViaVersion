package us.myles.ViaVersion.api;

import java.util.Set;

public interface ViaVersionConfig {

    /**
     * Get if the plugin should check for updates
     *
     * @return true if update checking is enabled
     */
    boolean isCheckForUpdates();

    /**
     * Get if collision preventing for players is enabled
     *
     * @return true if collision preventing is enabled
     */
    boolean isPreventCollision();

    /**
     * Get if 1.9 &amp; 1.10 clients are shown the new effect indicator in the top-right corner
     *
     * @return true if the using of the new effect indicator is enabled
     */
    boolean isNewEffectIndicator();

    /**
     * Get if 1.9 &amp; 1.10 clients are shown the new death message on the death screen
     *
     * @return true if enabled
     */
    boolean isShowNewDeathMessages();

    /**
     * Get if metadata errors will be suppressed
     *
     * @return true if metadata errors suppression is enabled
     */
    boolean isSuppressMetadataErrors();

    /**
     * Get if blocking in 1.9 &amp; 1.10 appears as a player holding a shield
     *
     * @return true if shield blocking is enabled
     */
    boolean isShieldBlocking();

    /**
     * Get if armor stand positions are fixed so holograms show up at the correct height in 1.9 &amp; 1.10
     *
     * @return true if hologram patching is enabled
     */
    boolean isHologramPatch();

    /**
     * Get if the 1.11 piston animation patch is enabled
     *
     * @return true if the piston patch is enabled.
     */
    boolean isPistonAnimationPatch();

    /**
     * Get if boss bars are fixed for 1.9 &amp; 1.10 clients
     *
     * @return true if boss bar patching is enabled
     */
    boolean isBossbarPatch();

    /**
     * Get if the boss bars for 1.9 &amp; 1.10 clients are being stopped from flickering
     * This will keep all boss bars on 100% (not recommended)
     *
     * @return true if boss bar anti flickering is enabled
     */
    boolean isBossbarAntiflicker();

    /**
     * Get the vertical offset armor stands are being moved with when the hologram patch is enabled
     *
     * @return the vertical offset holograms will be moved with
     */
    double getHologramYOffset();

    /**
     * Get if players will be automatically put in the same team when collision preventing is enabled
     *
     * @return true if automatic teaming is enabled
     */
    boolean isAutoTeam();

    /**
     * Get the maximum number of packets a client can send per second.
     *
     * @return The number of packets a client can send per second.
     */
    int getMaxPPS();

    /**
     * Get the kick message sent if the user hits the max packets per second.
     *
     * @return Kick message, with colour codes using '&amp;amp;'
     */
    String getMaxPPSKickMessage();

    /**
     * The time in seconds that should be tracked for warnings
     *
     * @return Time in seconds that should be tracked for warnings
     */
    int getTrackingPeriod();

    /**
     * The number of packets per second to count as a warning
     *
     * @return The number of packets per second to count as a warning.
     */
    int getWarningPPS();

    /**
     * Get the maximum number of warnings the client can have in the interval
     *
     * @return The number of packets a client can send per second.
     */
    int getMaxWarnings();

    /**
     * Get the kick message sent if the user goes over the warnings in the interval
     *
     * @return Kick message, with colour codes using '&amp;amp;'
     */
    String getMaxWarningsKickMessage();

    /**
     * Is anti-xray enabled?
     *
     * @return A boolean
     */
    boolean isAntiXRay();

    /**
     * Send supported versions in the status response packet
     *
     * @return If true, enabled
     */
    boolean isSendSupportedVersions();

    /**
     * Stimulate the player tick
     *
     * @return if true, enabled
     */
    boolean isStimulatePlayerTick();

    /**
     * Use the item cache to prevent high resource usage
     *
     * @return if true, enabled
     */
    boolean isItemCache();

    /**
     * Use the NMS player ticking
     *
     * @return if true, enabled
     */
    boolean isNMSPlayerTicking();

    /**
     * Replace extended pistons on 1.10 chunk loading.
     *
     * @return True if to replace them
     */
    boolean isReplacePistons();

    /**
     * Get the id for replacing extended pistons.
     *
     * @return The integer id
     */
    int getPistonReplacementId();

    /**
     * Force json transform
     *
     * @return True if enabled
     */
    boolean isForceJsonTransform();

    /**
     * Should we fix nbt array's in json chat messages for 1.12 clients
     *
     * @return True if enabled
     */
    boolean is1_12NBTArrayFix();

    /**
     * Should we make team colours based on the last colour in team prefix
     *
     * @return True if enabled
     */
    boolean is1_13TeamColourFix();

    /**
     * Should we fix shift quick move action for 1.12 clients
     *
     * @return True if enabled
     */
    boolean is1_12QuickMoveActionFix();

    /**
     * Get the blocked protocols
     *
     * @return An Integer list
     */
    Set<Integer> getBlockedProtocols();

    /**
     * Get the custom disconnect message
     *
     * @return Disconnect message
     */
    String getBlockedDisconnectMsg();

    /**
     * Get the message sent to players being kicked on reload.
     * Players are kicked to stop the server crashing
     *
     * @return Disconnect message
     */
    String getReloadDisconnectMsg();

    /**
     * Should we hide errors that occur when trying to converting to 1.13 data?
     *
     * @return True if enabled
     */
    boolean isSuppress1_13ConversionErrors();

    /**
     * Should we disable the 1.13 auto-complete feature to stop spam kicks? (for any server lower than 1.13)
     *
     * @return True if enabled
     */
    boolean isDisable1_13AutoComplete();

    /**
     * Tries to minimize cooldown animation.
     *
     * @return True if enabled
     */
    boolean isMinimizeCooldown();

    /**
     * Enable the serverside blockconnections for 1.13+ clients
     *
     * @return True if enabled
     */
    boolean isServersideBlockConnections();

    /**
     * Get the type of block-connection provider which should be used
     *
     * @return String world for world-level or packet for packet-level
     */
    String getBlockConnectionMethod();

    /**
     * When activated, only the most important blocks are saved in the BlockStorage.
     *
     * @return True if enabled
     */
    boolean isReduceBlockStorageMemory();

    /**
     * When activated with serverside-blockconnections, flower parts with blocks above will be sent as stems.
     * Useful for lobbyservers where users can't build and those stems are used decoratively.
     *
     * @return True if enabled
     */
    boolean isStemWhenBlockAbove();

    /**
     * When activated, the 1-layer snow will be sent as 2-layer snow to 1.13+ clients to have collision.
     *
     * @return True if enabled
     */
    boolean isSnowCollisionFix();

    /**
     * When greater than 0, enables tab complete request delaying by x ticks
     *
     * @return the delay in ticks
     */
    int get1_13TabCompleteDelay();

    /**
     * When activated, edited books with more than 50 pages will be shortened to 50.
     *
     * @return True if enabled
     */
    boolean isTruncate1_14Books();

    /**
     * Handles left handed info by using unused bit 7 on Client Settings packet
     *
     * @return True if enabled
     */
    boolean isLeftHandedHandling();

    /**
     * Fixes velocity bugs due to different hitbox for 1.9-1.13 clients on 1.8 servers.
     *
     * @return True if enabled
     */
    boolean is1_9HitboxFix();

    /**
     * Fixes velocity bugs due to different hitbox for 1.14+ clients on sub 1.14 servers.
     *
     * @return True if enabled
     */
    boolean is1_14HitboxFix();

    /**
     * Fixes non full blocks having 0 light for 1.14+ clients on sub 1.14 servers.
     *
     * @return True if enabled
     */
    boolean isNonFullBlockLightFix();

    boolean is1_14HealthNaNFix();

    /**
     * Should 1.15 clients respawn instantly / without showing the death screen
     *
     * @return True if enabled
     */
    boolean is1_15InstantRespawn();
}
