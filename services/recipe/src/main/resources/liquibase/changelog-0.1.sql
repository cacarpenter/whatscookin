--liquibase formatted sql
--changeset ccarpenter:0.1

CREATE TABLE ingredient_type
(
    id                        INT UNIQUE GENERATED ALWAYS AS IDENTITY,
    name                      TEXT NOT NULL UNIQUE,
    parent_ingredient_type_id INT,
    FOREIGN KEY (parent_ingredient_type_id) REFERENCES ingredient_type (id)
);

CREATE TABLE ingredient
(
    id   INT UNIQUE GENERATED ALWAYS AS IDENTITY,
    name TEXT NOT NULL UNIQUE
);

CREATE TABLE recipe
(
    id             INT UNIQUE GENERATED ALWAYS AS IDENTITY,
    name           TEXT NOT NULL UNIQUE,
    description    TEXT,
    type           TEXT,
    carb_conscious BIT,
    calories       INT,
    servings       INT,
    user_id        INT  NOT NULL,
    UNIQUE (user_id, name)
);

CREATE TABLE recipe_ingredient
(
    recipe_id     INT   NOT NULL,
    ingredient_id INT   NOT NULL,
    amount        FLOAT NOT NULL,
    amount_unit   CHAR(2),
    FOREIGN KEY (recipe_id) REFERENCES recipe (id),
    FOREIGN KEY (ingredient_id) REFERENCES ingredient (id)
);

CREATE TABLE photo
(
    id   INT UNIQUE GENERATED ALWAYS AS IDENTITY,
    size INT
);

CREATE TABLE recipe_photo
(
    recipe_id INT NOT NULL,
    photo_id  INT NOT NULL,
    FOREIGN KEY (recipe_id) REFERENCES recipe (id),
    FOREIGN KEY (photo_id) REFERENCES photo (id)
);