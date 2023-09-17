CREATE TABLE characters (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100) UNIQUE NOT NULL
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

CREATE TYPE attributes_enum AS ENUM (
    'Live',
    'Strength',
    'Mana'
);

CREATE TABLE character_attributes (
  id SERIAL PRIMARY KEY,
  value INTEGER,
  character INTEGER REFERENCES characters(id),
  attribute attributes_enum NOT NULL
);
