
-- Tablas para módulo Docentes
CREATE TABLE IF NOT EXISTS docente_perfil (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  nombre_completo VARCHAR(120) NOT NULL,
  fotografia_url VARCHAR(255),
  cargo VARCHAR(80),
  area VARCHAR(120),
  anios_experiencia INT
);
CREATE TABLE IF NOT EXISTS docente_formacion (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  docente_perfil_id BIGINT NOT NULL,
  titulo VARCHAR(120) NOT NULL,
  institucion VARCHAR(120),
  nivel VARCHAR(80),
  anio VARCHAR(4),
  CONSTRAINT fk_formacion_docente FOREIGN KEY (docente_perfil_id) REFERENCES docente_perfil(id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS docente_experiencia (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  docente_perfil_id BIGINT NOT NULL,
  institucion VARCHAR(120) NOT NULL,
  rol VARCHAR(120),
  desde DATE,
  hasta DATE,
  descripcion VARCHAR(255),
  CONSTRAINT fk_experiencia_docente FOREIGN KEY (docente_perfil_id) REFERENCES docente_perfil(id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS docente_reconocimiento (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  docente_perfil_id BIGINT NOT NULL,
  nombre VARCHAR(160) NOT NULL,
  otorgante VARCHAR(160),
  anio VARCHAR(4),
  descripcion VARCHAR(255),
  CONSTRAINT fk_reconocimiento_docente FOREIGN KEY (docente_perfil_id) REFERENCES docente_perfil(id) ON DELETE CASCADE
);
