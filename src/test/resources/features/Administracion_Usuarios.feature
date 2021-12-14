Feature: Validar Módulo Administración Usuarios

#  @Administración_Usuarios_Buscar
#  Scenario: Validar opción Buscar del módulo Administración Usuarios
#    Given un usuario que ingresa al aplicativo Aquarius
#    And se autentica con usuario y contraseña
#    When ingresa al módulo de administración de usuarios
#    Then valida busqueda
    
#  @Administración_Usuarios_Crear
#  Scenario: Validar opción Agregar del módulo Administración Usuarios
#    Given un usuario que ingresa al aplicativo Aquarius
#    And se autentica con usuario y contraseña
#    When ingresa al módulo de administración de usuarios 
#    Then valida Agregar
#    And valida Crear Usuario
#    And valida usuario creado
#    And valida Cancelar Crear Usuario

#  @Administración_Usuarios_Títulos_Grilla
#  Scenario: Validar títulos de la grilla del módulo Administración Usuarios
#    Given un usuario que ingresa al aplicativo Aquarius
#    And se autentica con usuario y contraseña
#    When ingresa al módulo de administración de usuarios 
#    Then valida Los títulos de la grilla

#  @Administración_Usuarios_Grupos_Grilla
#  Scenario: Validar opciones columa Grupos de la grilla del módulo Administración Usuarios
#    Given un usuario que ingresa al aplicativo Aquarius
#    And se autentica con usuario y contraseña
#    When ingresa al módulo de administración de usuarios 
#    Then valida administrar y ver grupo

  @Administración_Usuarios_Series_Grilla
  Scenario: Validar opciones columa Series de la grilla del módulo Administración Usuarios
    Given un usuario que ingresa al aplicativo Aquarius
    And se autentica con usuario y contraseña
    When ingresa al módulo de administración de usuarios 
    Then valida administrar y ver series
    
#  @Administración_Usuarios_Acción_Grilla
#  Scenario: Validar opciones columa Acción de la grilla del módulo Administración Usuarios
#    Given un usuario que ingresa al aplicativo Aquarius
#    And se autentica con usuario y contraseña
#    When ingresa al módulo de administración de usuarios
#    Then valida Editar usuario
#    And subir firma