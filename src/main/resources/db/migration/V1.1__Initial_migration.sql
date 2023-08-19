CREATE TABLE characters (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100)
);

CREATE TABLE heroes (
  id SERIAL PRIMARY KEY,
  money INTEGER,
  character INTEGER REFERENCES characters(id)
);

CREATE TABLE enemies (
  id SERIAL PRIMARY KEY,
  character INTEGER REFERENCES characters(id)
);

CREATE TABLE attributes (
   id SERIAL PRIMARY KEY,
   name VARCHAR(100)
);

INSERT INTO attributes (name) VALUES ('Live'), ('Strength'), ('Mana');

CREATE TABLE character_attributes (
  id SERIAL PRIMARY KEY,
  value INTEGER,
  character INTEGER REFERENCES characters(id),
  attribute INTEGER REFERENCES attributes(id)
);
