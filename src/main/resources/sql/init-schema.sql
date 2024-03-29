CREATE TABLE IF NOT EXISTS `member`
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    account       VARCHAR(255) UNIQUE   NULL,
    password      VARCHAR(255)          NULL,
    nickname      VARCHAR(255)          NULL,
    name          VARCHAR(255)          NULL,
    email         VARCHAR(255)          NULL,
    refresh_token VARCHAR(100)          NULL,
    enabled       TINYINT(1) DEFAULT 1  NOT NULL,
    CONSTRAINT pk_member PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS authority
(
    id        BIGINT AUTO_INCREMENT NOT NULL,
    name      VARCHAR(255)          NULL,
    member_id BIGINT                NULL,
    CONSTRAINT pk_authority PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS board
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255)          NULL,
    `description` TEXT                  NULL,
    create_date   datetime              NULL,
    update_date   datetime              NULL,
    creator_id    BIGINT                NULL,
    modifier_id   BIGINT                NULL,
    enabled       TINYINT(1) DEFAULT 1  NOT NULL,
    CONSTRAINT pk_board PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS article
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255)          NULL,
    `description` TEXT                  NULL,
    hits          INT        DEFAULT 0  NOT NULL,
    board_id      BIGINT                NULL,
    create_date   datetime              NULL,
    update_date   datetime              NULL,
    creator_id    BIGINT                NULL,
    modifier_id   BIGINT                NULL,
    enabled       TINYINT(1) DEFAULT 1  NOT NULL,
    CONSTRAINT pk_article PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS `comment`
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    `description` TEXT                  NULL,
    article_id    BIGINT                NULL,
    parent_id     BIGINT                NULL,
    depth         BIGINT                NULL,
    create_date   datetime              NULL,
    update_date   datetime              NULL,
    creator_id    BIGINT                NULL,
    modifier_id   BIGINT                NULL,
    enabled       TINYINT(1) DEFAULT 1  NOT NULL,
    CONSTRAINT pk_comment PRIMARY KEY (id)
);
