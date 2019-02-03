import json
persona = {}

with open('persona.json','r') as fileIn:
    persona = json.load(fileIn)
print(persona)