print("Система расчёта штрафов Германии")

car_speed = 111
is_town = True

fine_for_10_to_20 = 15
fine_for_20_to_30 = 30
fine_for_30_to_80 = 100
fine_for_80_and_more = 1000

town_speed = 50
country_speed = 70

if is_town:
  over_speed = car_speed - town_speed
else:
  over_speed = car_speed - country_speed

if over_speed < 10:
  print("Скорость не превышена или превышена незначительно")
elif over_speed >= 10 and over_speed < 20:
  print("Штраф: " + str(fine_for_10_to_20 ) + " евро")
elif over_speed >= 20 and over_speed < 30:
  print("Штраф: " + str(fine_for_20_to_30 ) + " евро")
elif over_speed >= 30 and over_speed < 80:
  print("Штраф: " + str(fine_for_30_to_80) + " евро")
elif over_speed >= 80:
  print("Штраф: " + str(fine_for_80_and_more) + " евро")