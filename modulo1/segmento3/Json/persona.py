import json
persona = {}
persona['nombre'] = 'german'
persona['apellido'] = 'basisty'

with open('persona.json','w') as fileOut:
    json.dump(persona,fileOut)